package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem5;
public class Player {

    // property koet da sybira tochkite
    private long starsScore;

    // kogato syzdavash player-a nqma nujda da ima property-ta v skobite
    public Player() {
        //no vinagi shte ima score za da mu sybira tochkite
        this.starsScore = 0;
    }


    // metodche koeto da sybira tochkite v obshtite
    public void addStars(int starsToAdd) {
        this.starsScore += starsToAdd;
    }


    public long getStars() {
        return this.starsScore;
    }
}

