public class ident_profile {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String skin_tone;
    private String eye_color;
    private String hair_color;
    private String fav_color;
    private String[] hobbies = {"none"};
    // constructor for personality
    public ident_profile(){
        this.name = "";
        this.age = 0;
        this.height = 0;
        this.weight = 0;
        this.skin_tone = "";
        this.eye_color = "";
        this.hair_color = "";
        this.fav_color = "";
    }
    public ident_profile(String name,int age,int height,int weight,String skin_tone,String hair_color,String fav_color,String[] hobbies){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.skin_tone = skin_tone;
        this.hair_color = hair_color;
        this.fav_color = fav_color;
        this.hobbies = hobbies.clone();
    }
}
