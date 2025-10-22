package DAO;

import java.util.List;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

import Modelo.KonexioaDB;


public class ErabiltzaileDao {
	
	public boolean loginDataOndo(String email, String psw) {
		boolean loginOk = false;

		KonexioaDB conection = new KonexioaDB();

		// Konexioa dagoen konprobatu

		Firestore db = conection.konektatuDB();
		try {
			Query consulta = db.collection("users").whereEqualTo("email", email).whereEqualTo("password", psw);
			ApiFuture<QuerySnapshot> querySnapshot = consulta.get();
			List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();

			if (!documents.isEmpty()) {
				loginOk = true;
			}
			db.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		return loginOk;
	}


}
