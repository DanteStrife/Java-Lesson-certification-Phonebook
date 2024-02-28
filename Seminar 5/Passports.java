import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    public void add(String passNum, String lastName){
        map.put(passNum, lastName);
    }

    public String getByPassNum(String passNum){
        return passNum + " : " + map.get(passNum);
    }

    public String getByLastName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (var entry : map.entrySet()){
            if(entry.getValue().equals(lastName)){
                stringBuilder.append(entry.getKey())
                        .append(" : ")
                        .append(lastName)
                        .append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String getAll(){
        return map.toString();
    }
}
