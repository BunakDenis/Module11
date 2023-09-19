package global.goit.edu.module11.Task4;

public class RansomAlgorithm {

    private Long a, c, m;

    public RansomAlgorithm(Long a, Long c, Long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public Long nextLong (Long x) {
        //x[n + 1] = 1 (a x[n] + c) % m
        x += 1;
        return (1 * (a * x + c) % m);

    }

}
