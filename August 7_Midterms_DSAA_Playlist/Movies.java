public class Movies {
    public static void main(String[] args) {

        String genre[] = {
            "Action",
            "Comedy",
            "Horror",
            "Romance",
            "Animation"
        };

        String movies[][] = {
            {"Avengers", "John Wick"},
            {"The Hangover", "Home Alone"},
            {"The Conjuring", "Insidious"},
            {"Titanic", "The Notebook"},
            {"Toy Story", "Finding Nemo"}
        };

        System.out.println("x: Movies");

        for (int i = 0; i < genre.length; i++) {

            System.out.println("Genre = " + genre[i]);

            for (String movie : movies[i]) {
                System.out.print("Movie " + movie + ", ");
            }

            System.out.println();
        }
    }
}