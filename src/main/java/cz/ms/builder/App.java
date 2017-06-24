package cz.ms.builder;

/**
 * Created by martin on 24.06.17.
 */
public class App {

    public static void main(String[] args){

        User user = new User.UserBuilder("Martin", "Soušek")
                .age(29)
                .address("někde")
                .nickname("drs")
                .build();

    }
}
