package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem5;
public class GalacticCluster {

    private Galactic galactic;


    public GalacticCluster(Galactic galactic) {
        this.galactic = galactic;
    }



// metoda shte poluchava EVIl row i EVIL col kato start
    // ROW i COL shte namalqvato zashtoto vypreki che cyrvim kym x = 0 i y = +1... +1...
    // defakto zapochvame ot dolen desen ygyl(row = matrix.length && col = matrix[row].length - 1)
    //i vyrvim kym goren lqv... t.e. kym red 0 , colonka 0
    public void moveEvilForce(int evilRow, int evilCol) {
        //5...4...3....2.....1.....0 == 0 ...SPIRA
        while (evilRow >= 0 && evilCol >= 0) {
            // polzvame GETTER-ite ot metoda ni v klasa GALACTIC
            // zashtoto EVIL moje da zapochva IZVYN MATRICATA....
            // taka che shte zapochnem da slagame nulichi kogato stigne samata MATRCA/GALACTICA
            if (evilRow < galactic.getRow() && evilCol < galactic.getCol()) {
                galactic.setStarValue(evilRow, evilCol, 0);
            }
            // namalvame zashtoto zapochva ot dolu, dqsno;
            evilRow--;
            evilCol--;
        }
    }




    // metoda shte hodi po matricata za Player-a
    public int collectPlayerStars(int playerRow, int playerCol) {
        // inicializirame si edna promenliva za obshti broi tochki/svezdi
        int sum = 0;

        //dokato igracha NE E stignal 0
        while (playerRow >= 0 && playerCol < galactic.getCol()) {
            //kogato igracha e veche VYV GALACTICATA..
            if (playerRow < galactic.getRow() && playerCol >= 0 && playerCol < galactic.getCol()) {
                //togava zapochni da sybirash tochkite
                sum += galactic.getStarValue(playerRow, playerCol);
            }
            //i go mesti
            playerCol++;
            playerRow--;
        }

        return sum;
    }
}
