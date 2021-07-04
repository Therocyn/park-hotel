package controlador;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManipuladorSerializaveis {

	public static void serializa(String nomeArquivo, Object objeto) {
		try {
			FileOutputStream fos = new FileOutputStream(nomeArquivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(objeto);

			oos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static Object desserializa(String nomeArquivo) {
		Object objeto = null;

		try {
			FileInputStream fis = new FileInputStream(nomeArquivo);
			ObjectInputStream ois = new ObjectInputStream(fis);

			objeto = (Object) ois.readObject();

			ois.close();
			fis.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e2) {
			System.out.println(e2.getMessage());
			e2.printStackTrace();
		}

		return objeto;
	}
}