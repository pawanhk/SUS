public class identity {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String skin_tone;
    private String eye_color;
    private String hair_color;
    private String fav_color;
    private String[] hobbies = {"Math","Reading"};
    // constructor for personality
    public identity(){
        this.name = "Sylyvy";
        this.age = 0;
        this.height = 170;
        this.weight = 120;
        this.skin_tone = "pale";
        this.eye_color = "green";
        this.hair_color = "black";
        this.fav_color = "black";
    }
    public identity(String name,int age,int height,int weight,String hair_color,String fav_color){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hair_color = hair_color;
        this.fav_color = fav_color;
    }
}
