class MovieRequest {
    private Movie film;

    public MovieRequest(Movie film) {
        this.film = film;
    }

    public void talepEt() {
        if (film.isTalepEdilebilir()) {
            System.out.println(film.getBaslik() + " filmi talep edilmiştir.");
        } else {
            System.out.println(film.getBaslik() + " filmi mevcut değildir.");
        }
    }
}
