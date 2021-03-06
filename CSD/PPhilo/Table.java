// CSD Mar 2013 Juansa Sendra
package PPhilo;

public interface Table {
    void begin(int id);

    long ponder(int id);

    void takeR(int id);

    void takeL(int id);

    long eat(int id);

    void dropR(int id);

    void dropL(int id);

    void end(int id);

    void takeLR(int id);

    void enter(int id);

    void exit(int id);
}
