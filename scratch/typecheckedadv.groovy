import java.awt.Dimension

    Dimension d = [100, 200]

    def cl = { new Date() }
    long time = cl().time


    def closure = { int x, int y -> x+y }
    closure(1,2)
    closure('1','2') // complains

