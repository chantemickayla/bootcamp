
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SoccerLeague {
    TreeMap<String, Integer> map = new TreeMap<>();
//    TreeMap<String,Integer > map = 
//      new TreeMap<>(Comparator.reverseOrder());
    
    

    public static void main(String[] args) {

        SoccerLeague sl = new SoccerLeague();
        

        try {
            File myFile = new File("C:\\Users\\Chante\\Documents\\Soccer.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            int i = 0;
            String[] results = new String[5];
            while ((line = reader.readLine()) != null) {
                results[i] = line;
                sl.splitResults(line);
                i++;
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(sl.map);

    }

    public void splitResults(String line) {
        String[] teams = line.split(", ");
        String[] team1 = teams[0].split(" ");
        String[] team2 = teams[1].split(" ");
        String team1Name = team1[0];
        int team1Score = Integer.parseInt(team1[1]);
        String team2Name = team2[0];
        int team2Score = Integer.parseInt(team2[1]);
        createAndSortTreemap(team1Name, team1Score, team2Name, team2Score);
        
        
        //checking points for each team

    }

    public void createAndSortTreemap(String t1Name, int t1Score, String t2Name, int t2Score) {
       
        int count = 0;
        if (t1Score == t2Score) {
            if (map.containsKey(t1Name)) {
                count = map.get(t1Name);
                map.put(t1Name, count + 1);
            } else {
                map.put(t1Name, 1);
            }
            if (map.containsKey(t2Name)) {
                count = map.get(t2Name);
                map.put(t2Name, count + 1);
            } else {
                map.put(t2Name, 1);
            }
        } 
        else if (t1Score > t2Score){
            if(map.containsKey(t1Name)){
                count= map.get(t1Name);
                map.put(t1Name, count +3);
            }
            else{
                map.put(t1Name,3);
            }
            if(!(map.containsKey(t2Name))){
                map.put(t2Name,0);
            }
        }
        
        else {
             if(map.containsKey(t2Name)){
                count= map.get(t2Name);
                map.put(t2Name, count +3);
            }
            else{
                map.put(t2Name,3);
            }
            if(!(map.containsKey(t1Name))){
                map.put(t1Name,0);
            }
            
        }


    }
}
