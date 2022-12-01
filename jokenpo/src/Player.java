public class Player {
    // attributes
    private String name;
    private Integer score;

    // constructor
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void incrementScore() {
        setScore(getScore() + 1);
    }

    // getter and setter (a getter method returns its value while a setter method sets or updates its value. Getters and setters are also known as accessors and mutators, respectively.)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}
