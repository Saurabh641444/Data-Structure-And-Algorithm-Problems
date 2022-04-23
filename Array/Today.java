public class Codec { 
  Map<Long, String> table = new HashMap<>();
  long id = 1;

  public String encode(String longUrl) {
    table.put(id, longUrl);
    return Long.toString(id++);
  }

  public String decode(String shortUrl) {
    return table.get(Long.parseLong(shortUrl));    
  }
}
