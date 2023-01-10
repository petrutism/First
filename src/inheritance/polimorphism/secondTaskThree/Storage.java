package inheritance.polimorphism.secondTaskThree;

interface Storage {
    void saveinfo (Info info);

    Info findInfo (Integer id);

    Info findInfo (String word);
}
