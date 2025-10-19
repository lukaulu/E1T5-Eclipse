package Modelo;

import java.io.FileInputStream;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;

public class KonexioaDB {
	
	public Firestore konektatuDB() {
		Firestore db = null;
		
		try {
			FileInputStream serviceAcc = new FileInputStream("JSON DE LA BASE DE DATOS");
			FirestoreOptions firestoreOptions = FirestoreOptions.getDefaultInstance().toBuilder()
					.setProjectId("dberronka3t").setCredentials(GoogleCredentials.fromStream(serviceAcc)).build();
			db = firestoreOptions.getService();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return db;	
	}
	
	public void closeDB(Firestore db) {
		try {
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
