public class App {
    public static void main(String[] args) throws Exception {
        int keyAge[] = {0,5,10,13,15,16,18,21,30,40,50,55,65,70,100};
        String keyEvent[] = {"Birth","Kindergarten","Preteen","Teen","Driving","Sweet16",
        "High School Graduation","Adult-All States", "Thirties","Forties","Fifties","Early Retirement","Retirement",
        "Federal Retirement", "Centurian"};

        //keyAgeToYear(keyAge);
        fullReport(keyAgeToYear(keyAge), keyEvent);
        
        

    }
    public static int[] keyAgeToYear(int[] key) {
        int key2[] = new int[key.length];
        for(int i = 0; i < key.length; i++){
            key2[i] = 1903 + key[i];
        }
        return key2;
    }
    private static void fullReport(int[] key, String[] keys) {
        for(int i = 0; i < key.length; i++){
            System.out.println(key[i] + "\t" + keys[i]);
        }
    }
}
