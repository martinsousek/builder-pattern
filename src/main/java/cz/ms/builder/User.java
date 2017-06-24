package cz.ms.builder;

/**
 * Created by martin on 24.06.17.
 */
public class User {

    private final String name;
    private final String lastName;
    private final int age;
    private final String address;
    private final String nickname;

    private User(UserBuilder builder){
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.nickname = builder.nickname;
    }

    public static class UserBuilder{
        private final String name;
        private final String lastName;
        private int age;
        private String address;
        private String nickname;

        public UserBuilder(String name, String lastName){
            this.name = name;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder address(String address){
            this.address=address;
            return this;
        }

        public UserBuilder nickname(String nickname){
            this.nickname = nickname;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
