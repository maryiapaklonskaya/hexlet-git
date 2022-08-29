package People;

/* CREATE AN INTERFACE THAT DEFINES SOME ACTIONS USED HUMAN AND USE THIS INTERFACE IN
2 SEPARATE ABSTRACT CLASSES MEN AND WOMEN AND USE THOSE IN 2 MAIN CLASSES FRO MEN AND WOMEN */

public interface People {
    void breath();
    void walk();


}

abstract class Men implements People {
    @Override public void breath()
    {
        System.out.println("*INHALED LOUDLY*\n*SNORES WHILE EXHALING*");
    }
    @Override public void walk()
    {
        System.out.println("*average step is 1m*");
    }
}

abstract class Women implements People {
    @Override public void breath()
    {
        System.out.println("*inhaled silently*\n*exhales silently*");
    }
    @Override public void walk()
    {
        System.out.println("*average step is 70cm*");
    }

}

