import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    private Map<Integer, String> codes = new HashMap<>();
    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code,country);
    }

    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!codes.containsKey(code) && !codes.containsValue(country)) {
            codes.put(code,country);
        }
    }

    public Integer findDialingCode(String country) {
        for (int key : codes.keySet()){
            if (codes.get(key) == country){
                return key;
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        codes.remove(findDialingCode(country));
        codes.put(code, country);
    }
}
