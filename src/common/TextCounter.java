package common;

public class TextCounter {
    private int rows;
    private int letters;
    //attribut för antal ord
    //attribut för längsta ordet
    //attribut för om programmet körs eller inte

    public TextCounter() {
        this.rows = 0;
        this.letters = 0;
        //ge startvärden på alla våra attribut
    }

    public void count(String text) {
            //kontrollera om vi har skrivit stop
                //i så fall ändra på attribut om detta
            //lägga till antal tecken
            //lägga till antal ord


            String[] words = text.split(" ");
            //words.length;
            for(int i=0; i<words.length; i++) {
                //kontrollera om ordet är det längsta hittils
                    //i så fall ändra så att det är det längsta
                System.out.println(words[i]);
            }

            rows += 1;
        //}
    }

    public int getRows() {
        return rows;
    }

    public int getLetters() {
        //exempel inte korrekt
        return 7;
    }

    public int getWords() {
        //exempel inte korrekt
        return 3;
    }

    public boolean isRunning() {
        //exempel inte korrekt
        return true;
    }
}
