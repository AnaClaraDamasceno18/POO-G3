import java.util.HashMap;

public class UserAuthentication {
    private HashMap<String, String> userMap;

    public UserAuthentication() {
        userMap = new HashMap<String, String>();
        // Adicione aqui os pares usuário/senha ao HashMap
        userMap.put("usuario1", "senha1");
        userMap.put("usuario2", "senha2");
        userMap.put("usuario3", "senha3");
    }

    public boolean authenticate(String user, String password) {
        if (userMap.containsKey(user)) {
            if (userMap.get(user).equals(password)) {
                return true;
            }
        }
        return false;
    }
}
