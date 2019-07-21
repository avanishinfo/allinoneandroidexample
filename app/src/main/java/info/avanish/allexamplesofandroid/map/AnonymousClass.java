package info.avanish.allexamplesofandroid.map;

/**
 * Created by kunwa on 3/8/2018.
 */

public interface AnonymousClass {
    int x=10;

    void getAge();
}

class Anonymous{

    public static void main(String... args){

        AnonymousClass obj = new AnonymousClass() {
            @Override
            public void getAge() {
                System.out.print("Anonymous Class");
            }
        };
    }
}
