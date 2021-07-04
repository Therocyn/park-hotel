package controlador;
import visao.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import modelo.*;
public class Controlador {

	GUIBilheteiro guiBilheteiro;
	GUIBrinquedos guiBrinquedos;
	GUICadastro guiCadastro;
	GUICheckin guiCheckin;
	GUICheckout guiCheckout;
	GUIEntretenimentoAdulto guiEntretenimentoAdulto;
	GUIHotel guiHotel;
	GUILogin guiLogin;
	GUILojinhaRecompensas guiLojinhaRecompensas;
	GUIMenuVisitantes guiMenuVisitantes;
	GUIRestaurante guiRestaurante;
	GUICarteira guiCarteira;
	GUIHistorico guiHistorico;
	boolean senhaVerificada = false;
	ArrayList<Funcionario> funcionarios;
	ArrayList<Visitante> visitantes;

	public Controlador(ArrayList<Funcionario> funcionarios,
			ArrayList<Visitante> visitantes) { /*
												 * o construtor recebe os arraylist de funcionarios e visitantes, abre a
												 * tela de login e encaminha o usu�rio para sua interface designada
												 */
		this.funcionarios = funcionarios;
		this.visitantes = visitantes;
		guiLogin = new GUILogin();
		guiLogin.setVisible(true);
		guiLogin.getBotaoLogin().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = new String(guiLogin.getSenha().getPassword());
				if (Buscador.achaFuncionario(funcionarios, senha)) { // o achaFuncionario retorna true se achar algum
																		// funcionario corresponde a senha digitada e
																		// manda ele pro setor dele
					String setor = Buscador.retornaFuncionario(funcionarios, senha).getSetor();
					if (setor == "Bilheteiro") {
						guiLogin.dispose();
						abrirGUIbilheteria();
					} else if (setor == "Brinquedos") {
						guiLogin.dispose();
						abrirGUIbrinquedos();
					} else if (setor == "Entret.Adulto") {
						guiLogin.dispose();
						abrirGUIadulto();
					} else if (setor == "Hotel") {
						guiLogin.dispose();
						abrirGUIhotel();
					} else if (setor == "Lojinha") {
						guiLogin.dispose();
						abrirGUIlojinha();
					} else if (setor == "Restaurante") {
						guiLogin.dispose();
						abrirGUIrestaurante();
					}
				} else if (Buscador.achaVisitante(visitantes, senha)) { // se nao achar nenhum funcionario e achar um
																		// visitante, manda pra tela do visitante
					guiLogin.dispose();
					abrirGUIvisitante();
				} else {
					System.out.println("usuario n�o encontrado ou senha errada");
					JOptionPane.showMessageDialog(null, "Usu�rio n�o encontrado ou senha incorreta\n", "ERRO",
							JOptionPane.ERROR_MESSAGE);
					guiLogin.getSenha().setText(null);

				}
			}
		});
		ListenerCliqueDeMouse meulistener = new ListenerCliqueDeMouse(guiLogin, this); // listener pro cadastro
		guiLogin.getCadastrar().addMouseListener(meulistener);
		guiLogin.getBotao2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManipuladorSerializaveis.serializa("visitantes.txt", visitantes); // botao de sair c/ salvamento dos
																					// visitantes cadastrados
				guiLogin.dispose();
			}
		});
	}

	public void abrirGUIbilheteria() { /*
										 * se o funcionario for o da bilheteria, abre a GUI dele e chama o m�todo que
										 * cuida das opera��es dessa GUI
										 */
		guiBilheteiro = new GUIBilheteiro();
		guiBilheteiro.setVisible(true);
		operacoesGUIbilheteiro();
	}

	public void abrirGUIbrinquedos() { /*
										 * se o funcionario for o que cuida dos brinquedos, abre a GUI dele e chama o
										 * m�todo que cuida das opera��es dessa GUI
										 */
		guiBrinquedos = new GUIBrinquedos();
		guiBrinquedos.setVisible(true);
		operacoesGUIbrinquedos();
	}

	public void abrirGUIadulto() { /*
									 * se o funcionario trabalha no entretenimento adulto, abre a GUI dele e chama o
									 * m�todo que cuida das opera��es dessa GUI
									 */
		guiEntretenimentoAdulto = new GUIEntretenimentoAdulto();
		guiEntretenimentoAdulto.setVisible(true);
		operacoesGUIadulto();
	}

	public void abrirGUIhotel() { /*
									 * se o funcionario cuida do hotel, abre a GUI do hotel e aguarda o funcion�rio
									 * escolher se vai colocar que o visitante vai fazer checkin ou checkout, depois
									 * disso abre as GUIs designadas de checkin e checkout
									 */
		guiHotel = new GUIHotel();
		guiHotel.setVisible(true);

		guiHotel.getBotaoVoltar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guiHotel.dispose();
				guiLogin.setVisible(true);
			}
		});

		guiHotel.getbotaoCheckIn().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				fazerCheckIn();
			}
		});

		guiHotel.getbotaoCheckOut().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				fazerCheckOut();
			}
		});
	}

	public void abrirGUIlojinha() { /*
									 * se o funcionario trabalha na lojinha de recompensas, abre a GUI dele e chama
									 * o m�todo que cuida das opera��es dessa GUI
									 */
		guiLojinhaRecompensas = new GUILojinhaRecompensas();
		guiLojinhaRecompensas.setVisible(true);
		operacoesGUIlojinha();
	}

	public void abrirGUIrestaurante() { /*
										 * se o funcionario trabalha no restaurante, abre a GUI dele e chama o m�todo
										 * que cuida das opera��es dessa GUI
										 */
		guiRestaurante = new GUIRestaurante();
		guiRestaurante.setVisible(true);
		operacoesGUIrestaurante();
	}

	public void abrirGUIvisitante() { /* abre a gui do visitante */
		guiMenuVisitantes = new GUIMenuVisitantes();
		guiMenuVisitantes.setVisible(true);
		guiMenuVisitantes.getBotao1()
				.addActionListener(new ActionListener() { /*
															 * aqui � o botao onde vai pra carteira, ai abre ela e vai
															 * pro metodo q realiza as opera��es dela
															 */
					public void actionPerformed(ActionEvent e) {
						guiCarteira = new GUICarteira();
						guiCarteira.setVisible(true);
						operacoesGUIcarteira();
					}
				});

		guiMenuVisitantes.getBotao2().addActionListener(
				new ActionListener() { /*
										 * aqui � o bot�o do hist�rico, ai abre ele e vai pro metodo das opera��es dele
										 */
					public void actionPerformed(ActionEvent e) {
						guiHistorico = new GUIHistorico();
						guiHistorico.setVisible(true);
						operacoesGUIhistorico();
					}
				});

		guiMenuVisitantes.getBotao3()
				.addActionListener(new ActionListener() { /* aqui � o botao de voltar, ai ele volta pra tela do login */

					public void actionPerformed(ActionEvent e) {
						guiMenuVisitantes.dispose();
						guiLogin.setVisible(true);

					}
				});
	}

	public void abrirGUIcadastro() { /* abre a GUI do cadastro se na tela de login o usuario clicar p se cadastrar */
		guiCadastro = new GUICadastro();
		guiCadastro.setVisible(true);
		fazerCadastro();
	}

	public void fazerCadastro() { // metodo pras opera��es de cadastro do visitante
		guiCadastro.getConfirmacaoCadastro().addActionListener(new ActionListener() { // se o usuario clicar no botao de
																						// confirmar o cadastro
			public void actionPerformed(ActionEvent e) {
				try {
					if (!(Buscador.achaFuncionario(funcionarios, guiCadastro.getSenha().getText()) // se o buscador n
																									// achar nenhum
																									// funcionario/visitante
							|| Buscador.achaVisitante(visitantes, guiCadastro.getSenha().getText()))) {
						if (!guiCadastro.getNome().getText().equals("") // se todos os campos tiverem preenchidos
								&& (guiCadastro.getSenha().getText().length() > 0)
								&& guiCadastro.getIdade().getText() != "" && guiCadastro.getAltura().getText() != ""
								&& guiCadastro.getPeso().getText() != ""
								&& (guiCadastro.getBotaoSim().isSelected() || guiCadastro.getBotaoNao().isSelected())) {
							if (guiCadastro.getBotaoSim().isSelected()) { // se o visitante selecionar vip, sera
																			// cadastrado como vip
								Visitante visitante = new Visitante(guiCadastro.getNome().getText(),
										guiCadastro.getSenha().getText(),
										Double.parseDouble(guiCadastro.getAltura().getText().replace(",", ".")),
										Integer.parseInt(guiCadastro.getIdade().getText()),
										Double.parseDouble(guiCadastro.getPeso().getText().replace(",", ".")), true);
								visitantes.add(visitante);
								guiCadastro.dispose();
								guiLogin.setVisible(true);
							} else { // senao nao
								Visitante visitante = new Visitante(guiCadastro.getNome().getText(),
										guiCadastro.getSenha().getText(),
										Double.parseDouble(guiCadastro.getAltura().getText().replace(",", ".")),
										Integer.parseInt(guiCadastro.getIdade().getText()),
										Double.parseDouble(guiCadastro.getPeso().getText().replace(",", ".")), false);
								visitantes.add(visitante);
								guiCadastro.dispose();
								guiLogin.setVisible(true);
							}

						} else {
							System.out.println("usuario nao preencheu algum campo");
							JOptionPane.showMessageDialog(null, "Preencha todos os campos\n", "ERRO",
									JOptionPane.ERROR_MESSAGE); //
						}
					} else {
						System.out.println("colisao de senhas, tente outra");
						JOptionPane.showMessageDialog(null, "Senha j� utilizada, tente outra\n", "ERRO",
								JOptionPane.ERROR_MESSAGE);
						guiCadastro.getSenha().setText(null);
					}
				} catch (NumberFormatException e4) { // catcher pro usuario n errar o formato dos campos
					JOptionPane.showMessageDialog(null, "Insira valores v�lidos\n", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		guiCadastro.getVoltar().addActionListener(new ActionListener() { // metodo p voltar
			public void actionPerformed(ActionEvent e) {
				guiCadastro.dispose();
				guiLogin.setVisible(true);
			}
		});
		ListenerBeneficios meulistener2 = new ListenerBeneficios();
		guiCadastro.getBeneficios().addMouseListener(meulistener2); // label que o visitante pode clicar p ver os
																	// beneficios do vip
	}

	public void fazerCheckIn() { // metodo pras opera��es do checkin
		senhaVerificada = false; // identificador se a senha ja foi verificada com o OK ou n�o
		guiCheckin = new GUICheckin();
		guiCheckin.setVisible(true);

		guiCheckin.getBotaoOK().addActionListener(new ActionListener() { // botao OK de verifica��o da senha
			public void actionPerformed(ActionEvent e) {
				String senha = new String(guiCheckin.getSenha().getPassword());
				if (Buscador.achaVisitante(visitantes, senha)) { // se o visitante for encontrado, poder� realizar o
																	// checkin
					double precoTotal = 0;
					senhaVerificada = true;
					System.out.println("Visitante encontrado");
					try {
						if (!guiCheckin.getTextoDiasReserv().getText().equals("") // se todos os campos tiverem
																					// preenchidos, ele mostra o valor q
																					// vai ser pago na label de
																					// pagamento total
								&& !guiCheckin.getTextoDiaa().getText().equals("")
								&& !guiCheckin.getTextoMes().getText().equals("")
								&& !guiCheckin.getTextoAno().getText().equals("")
								&& !guiCheckin.getTextoHora().getText().equals("")
								&& !guiCheckin.getTextoMin().getText().equals("")
								&& (guiCheckin.getBotaoSim1().isSelected() || guiCheckin.getBotaoNao1().isSelected())
								&& (guiCheckin.getBotaoSim2().isSelected() || guiCheckin.getBotaoNao2().isSelected())) {
							precoTotal = ((FuncionarioHotel) funcionarios.get(3)).informarTotalCheckIn(
									Buscador.retornaVisitante(visitantes, senha),
									Integer.parseInt(guiCheckin.getTextoDiasReserv().getText()),
									(Integer) guiCheckin.getContadorCamas().getValue(),
									guiCheckin.getBotaoSim1().isSelected(), guiCheckin.getBotaoSim2().isSelected());

							guiCheckin.getTextoPagar().setText(String.valueOf(precoTotal));
						} else {
							System.out.println("usuario nao preencheu algum campo");
							JOptionPane.showMessageDialog(null, "Preencha todos os campos\n", "ERRO",
									JOptionPane.ERROR_MESSAGE);
						}

					} catch (NumberFormatException e3) {
						System.out.println("formato dos valores errados para o calculo do valor total");
						JOptionPane.showMessageDialog(null, "Insira valores v�lidos\n", "ERRO",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					System.out.println("visitante n�o encontrado");
					JOptionPane.showMessageDialog(null, "Visitante n�o encontrado!\n", "ERRO",
							JOptionPane.ERROR_MESSAGE);
					guiCheckin.getSenha().setText(null);
				}
			}
		});

		guiCheckin.getBotaoConfirmar().addActionListener(new ActionListener() { // botao de confirma��o do checkin
			public void actionPerformed(ActionEvent e) {
				String senha = new String(guiCheckin.getSenha().getPassword());
				if (senhaVerificada) { // se a senha ja foi verificada
					try {
						if (((FuncionarioHotel) funcionarios.get(3)).checkIn( // e se o funcionario do hotel conseguir
																				// realizar o checkin usando seu m�todo
								Buscador.retornaVisitante(visitantes, senha),
								Double.parseDouble(guiCheckin.getTextoPagar().getText()),
								Integer.parseInt(guiCheckin.getTextoDiaa().getText()),
								Integer.parseInt(guiCheckin.getTextoMes().getText()),
								Integer.parseInt(guiCheckin.getTextoAno().getText()),
								Integer.parseInt(guiCheckin.getTextoHora().getText()),
								Integer.parseInt(guiCheckin.getTextoMin().getText()))) {

							JOptionPane.showMessageDialog(null, "Check-in efetuado com sucesso\n", "�XITO", // exibe a
																											// mensagem
																											// de exito
									JOptionPane.INFORMATION_MESSAGE);

							guiCheckin.getTextoDiasReserv().setText(null);
							guiCheckin.getTextoDiaa().setText(null);
							guiCheckin.getTextoMes().setText(null);
							guiCheckin.getTextoAno().setText(null);
							guiCheckin.getTextoHora().setText(null);
							guiCheckin.getTextoMin().setText(null);
							guiCheckin.getContadorCamas().setValue(0); // e reseta todos os campos p/ registrar o
																		// proximo visitante
							guiCheckin.setBotaoSim1(false);
							guiCheckin.setBotaoNao1(true);
							guiCheckin.setBotaoSim2(false);
							guiCheckin.setBotaoNao2(true);
							guiCheckin.getTextoPagar().setText(null);
							guiCheckin.getSenha().setText(null);
						} else {
							JOptionPane.showMessageDialog(null, "Cr�dito insuficiente!\n", "ERRO",
									JOptionPane.ERROR_MESSAGE);
						}
					} catch (NumberFormatException e1) {
						System.out.println("Formato de data ou hora est� errado!");
						JOptionPane.showMessageDialog(null, "Insira valores v�lidos para data e hor�rio\n", "ERRO",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					System.out.println("Primeiro verifique a senha!");
					JOptionPane.showMessageDialog(null, "Primeiro realize a verifica��o da senha do visitante", "ERRO",
							JOptionPane.ERROR_MESSAGE);
					guiCheckin.getSenha().setText(null);
				}
				senhaVerificada = false; // deixa como false a verifica��o de senha no final p nao ocorrerem alguns bugs
											// como: o funcion�rio confirmar o checkin de um visitante sem fazer a
											// verifica��o e contar msm assim
			}
		});

		guiCheckin.getBotaoVoltar().addActionListener(new ActionListener() { //botao de voltar
			public void actionPerformed(ActionEvent e) {
				guiCheckin.dispose();
			}
		});
	}

	public void fazerCheckOut() { //metodo de opera��o do checkout
		senhaVerificada = false;
		guiCheckout = new GUICheckout();
		guiCheckout.setVisible(true);
		guiCheckout.getBotaoOK().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = new String(guiCheckout.getSenha().getPassword());
				if (Buscador.achaVisitante(visitantes, senha)) { //se encontrar um visitante c/ a senha digitada
					senhaVerificada = true;
					JOptionPane.showMessageDialog(null, "Visitante encontrado!\n", "�XITO",
							JOptionPane.INFORMATION_MESSAGE);

				} else {
					System.out.println("Visitante n�o encontrado!");
					JOptionPane.showMessageDialog(null, "Visitante n�o encontrado!\n", "ERRO",
							JOptionPane.ERROR_MESSAGE);
					guiCheckout.getSenha().setText(null);
				}

			}
		});

		guiCheckout.getBotaoConfirmar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (senhaVerificada) { //se a senha j� foi verificada com o botao de OK
					String senha = new String(guiCheckout.getSenha().getPassword());
					try {
						((FuncionarioHotel) funcionarios.get(3)).checkOut(Buscador.retornaVisitante(visitantes, senha), //realiza o checkout
								Integer.parseInt(guiCheckout.getTextoDia().getText()),
								Integer.parseInt(guiCheckout.getTextoMes().getText()),
								Integer.parseInt(guiCheckout.getTextoAno().getText()),
								Integer.parseInt(guiCheckout.getTextoHora().getText()),
								Integer.parseInt(guiCheckout.getTextoMin().getText()));

						JOptionPane.showMessageDialog(null, "Check-out efetuado com sucesso\n", "�XITO",
								JOptionPane.INFORMATION_MESSAGE);

						guiCheckout.getSenha().setText(null);
						guiCheckout.getTextoDia().setText(null);
						guiCheckout.getTextoMes().setText(null);
						guiCheckout.getTextoAno().setText(null);
						guiCheckout.getTextoHora().setText(null);
						guiCheckout.getTextoMin().setText(null);
					} catch (NumberFormatException e1) { //catcher p erros de campo de digita��o
						System.out.println("Algum campo vazio ou com formato errado!");
						JOptionPane.showMessageDialog(null, "Preencha todos os campos com valores v�lidos\n", "ERRO",
								JOptionPane.ERROR_MESSAGE);
					}
					senhaVerificada = false;
				} else {
					System.out.println("Primeiro verifique a senha!");
					JOptionPane.showMessageDialog(null, "Primeiro realize a verifica��o da senha do visitante", "ERRO",
							JOptionPane.ERROR_MESSAGE);
					guiCheckout.getSenha().setText(null);
				}
			}
		});

		guiCheckout.getBotaoVoltar().addActionListener(new ActionListener() { //botao de voltar
			public void actionPerformed(ActionEvent e) {
				guiCheckout.dispose();
			}
		});
	}

	public void operacoesGUIadulto() { //metodo de opera��es da GUI de entret.adulto
		senhaVerificada = false;
		guiEntretenimentoAdulto.getBotaoOK().addActionListener(new ActionListener() { //botao de OK
			public void actionPerformed(ActionEvent e) {
				String senha = new String(guiEntretenimentoAdulto.getSenha().getPassword());
				if (Buscador.achaVisitante(visitantes, senha)) { //se encontrar 
					System.out.println("Senha encontrada!");
					JOptionPane.showMessageDialog(null, "Visitante encontrado!\n", "�XITO",
							JOptionPane.INFORMATION_MESSAGE);
					senhaVerificada = true;
					guiEntretenimentoAdulto.getLabelPontosAtuais()
							.setText(String.valueOf(Buscador.retornaVisitante(visitantes, senha).getCreditos()));
				} else {
					JOptionPane.showMessageDialog(null, "Visitane n�o encontrado!\n", "ERRO",
							JOptionPane.ERROR_MESSAGE);
					guiEntretenimentoAdulto.getSenha().setText(null);
				}

			}
		});

		guiEntretenimentoAdulto.getBotaoReset().addActionListener(new ActionListener() { //botao de reset limpa o campo dos dados do visitante
			public void actionPerformed(ActionEvent e) {
				guiEntretenimentoAdulto.getLabelPontosAtuais().setText("0");
				guiEntretenimentoAdulto.getSenha().setText("");
			}
		});

		guiEntretenimentoAdulto.getBotaoConfirmar().addActionListener(new ActionListener() {//botao de confirmar compra
			public void actionPerformed(ActionEvent e) {
				if (senhaVerificada) { //se a senha foi verificada pelo botao de OK
					String senha = new String(guiEntretenimentoAdulto.getSenha().getPassword());
					int retorno = ((FuncionarioEntretAdulto) funcionarios.get(2)).pagamentoEntretenimento( //tenta realizar o pagamento
							Buscador.retornaVisitante(visitantes, senha),
							guiEntretenimentoAdulto.getCaixinhaChampanhe().isSelected(),
							guiEntretenimentoAdulto.getCaixinhaBalada().isSelected(),
							guiEntretenimentoAdulto.getCaixinhaVinho().isSelected(),
							guiEntretenimentoAdulto.getCaixinhaHidro().isSelected());
					if (retorno == 0) { //o pagamento retorna 0 se for bem efetivado e exibimos uma mensagem disso
						System.out.println("Pagamento efetivado!");
						JOptionPane.showMessageDialog(null, "Pagamento efetuado com sucesso!\n", "�XITO",
								JOptionPane.INFORMATION_MESSAGE);

					}
					if (retorno == 1) { //o pagamento retorna 1 se o visitante tiver -18
						System.out.println("Visitante -18!");
						JOptionPane.showMessageDialog(null, "Visitane tem menos de 18 anos!\n", "ERRO",
								JOptionPane.ERROR_MESSAGE);
					}
					if (retorno == 2) { //o pagamento retorna 2 se o saldo for insuficiente
						System.out.println("Saldo insuficiente!");
						JOptionPane.showMessageDialog(null, "Saldo insuficiente!\n", "ERRO", JOptionPane.ERROR_MESSAGE);
					}
					guiEntretenimentoAdulto.getLabelPontosAtuais().setText(null);
					guiEntretenimentoAdulto.getSenha().setText(null);
					guiEntretenimentoAdulto.getCaixinhaChampanhe().setSelected(false);
					guiEntretenimentoAdulto.getCaixinhaBalada().setSelected(false); //apos o pagamento resetamos os campos para o proximo visitante
					guiEntretenimentoAdulto.getCaixinhaVinho().setSelected(false);
					guiEntretenimentoAdulto.getCaixinhaHidro().setSelected(false);

				} else {
					System.out.println("Primeiro verifique a senha!");
					JOptionPane.showMessageDialog(null, "Primeiro realize a verifica��o da senha do visitante", "ERRO",
							JOptionPane.ERROR_MESSAGE);
				}
				senhaVerificada = false; 
			}
		});

		guiEntretenimentoAdulto.getBotaoVoltar().addActionListener(new ActionListener() {//botao de voltar
			public void actionPerformed(ActionEvent e) {
				guiEntretenimentoAdulto.dispose();
				guiLogin.setVisible(true);
			}
		}

		);
	}

	public void operacoesGUIbilheteiro() {//metodo q realiza as opera��es do funcionario da bilheteria
		
		guiBilheteiro.getBotaoConfirmar().addActionListener(new ActionListener() {//botao de confirmar
			public void actionPerformed(ActionEvent e) {
				String senha = new String(guiBilheteiro.getSenha().getPassword()); //pega a senha no campo
				try {
					if (Buscador.achaVisitante(visitantes, senha)) { //se achar um visitante c/ a senha digitada
						if (guiBilheteiro.getTexto().getText().length() > 0) { //e o campo tiver algum caracter
							((FuncionarioBilheteiro) funcionarios.get(0)).adicionaCreditos( //adiciona os creditos
									Buscador.retornaVisitante(visitantes, senha),
									Double.parseDouble(guiBilheteiro.getTexto().getText()));
							System.out.println("Cr�dito adicionado!");
							JOptionPane.showMessageDialog(null, "Cr�dito adicionado!\n", "�XITO",
									JOptionPane.INFORMATION_MESSAGE);
							guiBilheteiro.getSenha().setText(null);
							guiBilheteiro.getTexto().setText(null);
						} else {
							System.out.println("Insira a quantidade de cr�ditos!");
							JOptionPane.showMessageDialog(null, "Insira a quantidade de cr�ditos!\n", "ERRO",
									JOptionPane.ERROR_MESSAGE);
						}
					} else {
						System.out.println("Senha errada!");
						JOptionPane.showMessageDialog(null, "Senha incorreta!\n", "ERRO", JOptionPane.ERROR_MESSAGE);
						guiBilheteiro.getSenha().setText(null);

					}
				} catch (NumberFormatException e2) {
					guiBilheteiro.getTexto().setText(null);
					System.out.println("Formato de cr�dito inv�lido!");
					JOptionPane.showMessageDialog(null, "Insira valores v�lidos\n", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		guiBilheteiro.getBotaoVoltar().addActionListener(new ActionListener() {//botao de voltar
			public void actionPerformed(ActionEvent e) {
				guiBilheteiro.dispose();
				guiLogin.setVisible(true);
			}
		});
	}

	public void operacoesGUIbrinquedos() {//metodo q realiza as opera��es dos funcionarios q cuidam dos brinquedos
		senhaVerificada = false;
		guiBrinquedos.getBotaoOK().addActionListener(new ActionListener() { //botao de OK de verifica��o da senha
			public void actionPerformed(ActionEvent e) {
				String senha = new String(guiBrinquedos.getSenha().getPassword());
				if (Buscador.achaVisitante(visitantes, senha)) { //se achar um visitante c/ a senha digitada
					System.out.println("Senha encontrada!");
					JOptionPane.showMessageDialog(null, "Visitante encontrado!\n", "�XITO",
							JOptionPane.INFORMATION_MESSAGE);
					senhaVerificada = true;
					guiBrinquedos.getLabelBaixo2()
							.setText(String.valueOf(Buscador.retornaVisitante(visitantes, senha).getCreditos())); //mostra a quantidade de creditos dele no label
				} else {
					System.out.println("Visitante n�o encontrado!");
					JOptionPane.showMessageDialog(null, "Visitante n�o encontrado!\n", "ERRO",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		guiBrinquedos.getBotaoReset().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guiBrinquedos.getLabelBaixo2().setText("0");
				guiBrinquedos.getSenha().setText("");
			}
		});

		guiBrinquedos.getBotaoConfirmar().addActionListener(new ActionListener() {//botao de confirmar compra do cliente p entrada no brinquedo
			public void actionPerformed(ActionEvent e) {
				int retorno = 0;
				if (senhaVerificada) { //se a senha ja tiver sido verificada
					String senha = new String(guiBrinquedos.getSenha().getPassword());
					retorno = ((FuncionarioBrinquedos) funcionarios.get(1)).andarBrinquedos( //tenta realizar o m�todo de pagamento do brinquedo
							Buscador.retornaVisitante(visitantes, senha), guiBrinquedos.getBotaozinho1().isSelected(),
							guiBrinquedos.getBotaozinho2().isSelected(), guiBrinquedos.getBotaozinho3().isSelected(),
							guiBrinquedos.getBotaozinho4().isSelected(), guiBrinquedos.getBotaozinho5().isSelected());
					if (retorno == 0) { //se o retorno do m�todo de pagamento do brinquedo for 0
						System.out.println("Pessoa pode andar no brinquedo!");
						JOptionPane.showMessageDialog(null, "O visitante pode andar no brinquedo!\n", "�XITO",
								JOptionPane.INFORMATION_MESSAGE);
					}
					if (retorno == 1) { //se for 1
						System.out.println("Pessoa n�o tem idade, peso ou altura para andar!");
						JOptionPane.showMessageDialog(null, "O visitante n�o tem idade, peso ou altura para andar!\n",
								"ERRO", JOptionPane.ERROR_MESSAGE);
					}
					if (retorno == 2) {//se for 2
						System.out.println("Pessoa n�o tem cr�ditos suficientes!");
						JOptionPane.showMessageDialog(null, "O visitante n�o tem cr�ditos suficientes\n", "ERRO",
								JOptionPane.ERROR_MESSAGE);
					}
					guiBrinquedos.getSenha().setText(null);
					guiBrinquedos.getLabelBaixo2().setText(null);
					guiBrinquedos.getBotaozinho1().setSelected(false);
					guiBrinquedos.getBotaozinho2().setSelected(false); //limpa os campos no final p/ preencher o proximo visitante
					guiBrinquedos.getBotaozinho3().setSelected(false);
					guiBrinquedos.getBotaozinho4().setSelected(false);
					guiBrinquedos.getBotaozinho5().setSelected(false);
				} else {
					System.out.println("Falta verificar a senha!");
					JOptionPane.showMessageDialog(null, "Primeiro realize a verifica��o da senha do visitante", "ERRO",
							JOptionPane.ERROR_MESSAGE);
				}

				senhaVerificada = false;
			}
		});

		guiBrinquedos.getBotaoVoltar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guiBrinquedos.dispose();
				guiLogin.setVisible(true);
			}
		});

	}

	public void operacoesGUIlojinha() { //metodo de opera��es da interface da lojinha de recompensas
		senhaVerificada = false;
		guiLojinhaRecompensas.getBotaoOK().addActionListener(new ActionListener() { //botao de OK da verifica��o
			public void actionPerformed(ActionEvent e) {
				String senha = new String(guiLojinhaRecompensas.getSenha().getPassword());
				if (Buscador.achaVisitante(visitantes, senha)) {//se encontrar o visitante c/ a senha digitada
					System.out.println("Senha encontrada!");
					JOptionPane.showMessageDialog(null, "Visitante encontrado!\n", "�XITO",
							JOptionPane.INFORMATION_MESSAGE);
					senhaVerificada = true;
					guiLojinhaRecompensas.getLabelPontosAtuais() //mostra a quantidade de pontos do visitante na label
							.setText(String.valueOf(Buscador.retornaVisitante(visitantes, senha).getPontos()));
				} else {
					System.out.println("Visitante n�o encontrado!");
					JOptionPane.showMessageDialog(null, "Visitante n�o encontrado!\n", "ERRO",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		guiLojinhaRecompensas.getBotaoReset().addActionListener(new ActionListener() { //reset p limpar os campos do visitante
			public void actionPerformed(ActionEvent e) {
				guiLojinhaRecompensas.getLabelPontosAtuais().setText("0");
				guiLojinhaRecompensas.getSenha().setText("");

			}
		});

		guiLojinhaRecompensas.getBotaoConfirmar().addActionListener(new ActionListener() { //botao de confirma��o da compra de algum produto da lojinha
			public void actionPerformed(ActionEvent e) {
				if (senhaVerificada) { //se a senha ja tiver sido verificada
					String senha = new String(guiLojinhaRecompensas.getSenha().getPassword());
					if (((FuncionarioLojinha) funcionarios.get(4)).descontaPontos( //tenta realizar o pagamento
							Buscador.retornaVisitante(visitantes, senha),
							guiLojinhaRecompensas.getCaixinhaBola().isSelected(),
							guiLojinhaRecompensas.getCaixinhaFusca().isSelected(),
							guiLojinhaRecompensas.getCaixinhaViolao().isSelected(),
							guiLojinhaRecompensas.getCaixinhaDVD().isSelected(),
							guiLojinhaRecompensas.getCaixinhaComputador().isSelected(),
							guiLojinhaRecompensas.getCaixinhaCelular().isSelected())) {
						System.out.println("Os pontos foram descontados!"); //se for bem sucedido aparece o exito
						JOptionPane.showMessageDialog(null, "Os pontos foram descontados!\n", "�XITO",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						System.out.println("Pontos insuficientes para realizar a compra!");
						JOptionPane.showMessageDialog(null, "Pontos insuficientes para realizar a compra!\n", "ERRO",
								JOptionPane.ERROR_MESSAGE);
					}
					guiLojinhaRecompensas.getLabelPontosAtuais().setText(null);
					guiLojinhaRecompensas.getSenha().setText(null);
					guiLojinhaRecompensas.getCaixinhaDVD().setSelected(false);
					guiLojinhaRecompensas.getCaixinhaBola().setSelected(false); //limpa os campos do pra preenchimento do proximo cliente
					guiLojinhaRecompensas.getCaixinhaFusca().setSelected(false);
					guiLojinhaRecompensas.getCaixinhaViolao().setSelected(false);
					guiLojinhaRecompensas.getCaixinhaComputador().setSelected(false);
					guiLojinhaRecompensas.getCaixinhaCelular().setSelected(false);
				} else {
					System.out.println("Falta verificar a senha!");
					JOptionPane.showMessageDialog(null, "Primeiro realize a verifica��o da senha do visitante", "ERRO",
							JOptionPane.ERROR_MESSAGE);
				}
				senhaVerificada = false;
			}
		});

		guiLojinhaRecompensas.getBotaoVoltar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guiLojinhaRecompensas.dispose();
				guiLogin.setVisible(true);
			}
		});

	}

	public void operacoesGUIrestaurante() { //metodo de opera��es do restaurante
		senhaVerificada = false;
		guiRestaurante.getBotaoOK().addActionListener(new ActionListener() { //botao de verifica��o da senha do cliente
			public void actionPerformed(ActionEvent e) {
				String senha = new String(guiRestaurante.getSenha().getPassword());
				if (Buscador.achaVisitante(visitantes, senha)) {  //se achar um cliente c/ essa senha
					System.out.println("Senha encontrada!");
					JOptionPane.showMessageDialog(null, "Senha encontrada!\n", "�XITO",
							JOptionPane.INFORMATION_MESSAGE);
					senhaVerificada = true;
					guiRestaurante.getLabelTotal()
							.setText(String.valueOf(Buscador.retornaVisitante(visitantes, senha).getCreditos())); //informa os creditos atuais na label

					guiRestaurante.getTexto()
							.setText(String.valueOf(((FuncionarioRestaurante) funcionarios.get(5)).InformaValorRefeicao(
									Buscador.retornaVisitante(visitantes, senha),
									guiRestaurante.getBotaoHamburger().isSelected(),
									(Integer) guiRestaurante.getContadorHamburger().getValue(),
									guiRestaurante.getBotaoBatata().isSelected(),
									(Integer) guiRestaurante.getContadorBatata().getValue(),  //e informa o valor total da refei��o
									guiRestaurante.getBotaoSalada().isSelected(),
									(Integer) guiRestaurante.getContadorSalada().getValue(),
									guiRestaurante.getBotaoRefrigerante().isSelected(),
									(Integer) guiRestaurante.getContadorRefrigerante().getValue(),
									guiRestaurante.getBotaoAgua().isSelected(),
									(Integer) guiRestaurante.getContadorAgua().getValue(),
									guiRestaurante.getBotaoCerveja().isSelected(),
									(Integer) guiRestaurante.getContadorCerveja().getValue())));
				} else {
					System.out.println("Visitante n�o encontrado!");
					JOptionPane.showMessageDialog(null, "Visitante n�o encontrado!\n", "ERRO",
							JOptionPane.ERROR_MESSAGE);
					guiRestaurante.getSenha().setText(null);
				}
			}
		});

		guiRestaurante.getBotaoVoltar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guiRestaurante.dispose();
				guiLogin.setVisible(true);
			}
		});

		guiRestaurante.getBotaoReset().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guiRestaurante.getSenha().setText("");
				guiRestaurante.getTexto().setText("");
			}
		});

		guiRestaurante.getBotaoConfirmar().addActionListener(new ActionListener() { //botao de confirma��o do pedido no restaurante
			public void actionPerformed(ActionEvent e) {
				String senha = new String(guiRestaurante.getSenha().getPassword());
				if (senhaVerificada) { //se a senha ja tiver sido verificada
					if (((FuncionarioRestaurante) funcionarios.get(5)).pagamentoRefeicao( //tenta realizar a compra da refei��o
							Buscador.retornaVisitante(visitantes, senha),
							guiRestaurante.getBotaoHamburger().isSelected(),
							(Integer) guiRestaurante.getContadorHamburger().getValue(),
							guiRestaurante.getBotaoBatata().isSelected(),
							(Integer) guiRestaurante.getContadorBatata().getValue(),  
							guiRestaurante.getBotaoSalada().isSelected(),
							(Integer) guiRestaurante.getContadorSalada().getValue(),
							guiRestaurante.getBotaoRefrigerante().isSelected(),
							(Integer) guiRestaurante.getContadorRefrigerante().getValue(),
							guiRestaurante.getBotaoAgua().isSelected(),
							(Integer) guiRestaurante.getContadorAgua().getValue(),
							guiRestaurante.getBotaoCerveja().isSelected(),
							(Integer) guiRestaurante.getContadorCerveja().getValue())) {
						senhaVerificada = false;
						System.out.println("O pedido foi realizado!");
						JOptionPane.showMessageDialog(null, "O pedido foi realizado!\n", "�XITO",
								JOptionPane.INFORMATION_MESSAGE);
						guiRestaurante.getTexto().setText(null);
						guiRestaurante.getSenha().setText(null); //e limpa os campos dps
						guiRestaurante.getLabelTotal().setText(null);
					} else {
						System.out.println("Cr�dito insuficiente!");
						JOptionPane.showMessageDialog(null, "Cr�dito insuficiente!\n", "ERRO",
								JOptionPane.ERROR_MESSAGE);
						senhaVerificada = false;
						guiRestaurante.getTexto().setText(null);
						guiRestaurante.getSenha().setText(null);
						guiRestaurante.getLabelTotal().setText(null);
					}
				} else {
					System.out.println("Primeiro confirme a senha!");
					JOptionPane.showMessageDialog(null, "Primeiro confirme a senha no campo ao lado\n", "ERRO",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	public void operacoesGUIcarteira() {//opera��es da "carteira" do visitante
		String senha = new String(guiLogin.getSenha().getPassword());
		guiCarteira.getLabelCreditos().setText(Buscador.retornaVisitante(visitantes, senha).getCreditos() + "R$"); //informa os creditos do visitante
		guiCarteira.getLabelPontos().setText(Double.toString(Buscador.retornaVisitante(visitantes, senha).getPontos())); //informa os pontos do visitante

		guiCarteira.getBotaoVoltar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guiCarteira.dispose();
			}
		});
	}

	public void operacoesGUIhistorico() { //opera��es do hist�rico de compras do visitante, vulgo recibo
		String senha = new String(guiLogin.getSenha().getPassword());
		Visitante historico = Buscador.retornaVisitante(visitantes, senha); //cata o visitante logado
		StringBuffer recibo = new StringBuffer();

		for (int i = 0; i < historico.getRecibo().size(); i++) {
			recibo.append(historico.getRecibo().get(i) + "\n"); //passa todos os gastos contidos no arraylist de string ate entao para a string recibo
		}
		;
		guiHistorico.getAreaTexto().setText(recibo.toString()); //informa o historico de gastos

		guiHistorico.getBotaoVoltar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guiHistorico.dispose();
			}
		});
	}
}