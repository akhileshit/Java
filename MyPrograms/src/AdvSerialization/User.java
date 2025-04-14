package AdvSerialization;

import java.io.*;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private transient String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Custom serialization logic
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject(); // Serialize non-transient fields
        oos.writeObject(encrypt(password)); // Encrypt the password before saving
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject(); // Deserialize non-transient fields
        this.password = decrypt((String) ois.readObject()); // Decrypt password
    }

    private String encrypt(String data) {
        // Simple encryption logic (example)
        return new StringBuilder(data).reverse().toString();
    }

    private String decrypt(String data) {
        return new StringBuilder(data).reverse().toString();
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return username + " " + password;
    }
    
}