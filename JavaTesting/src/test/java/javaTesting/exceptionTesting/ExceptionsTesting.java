package javaTesting.exceptionTesting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExceptionsTesting {

    @Test(expected = NullPointerException.class)
    public void NullPointerTest() {
        Integer edat = null;

        String edatEnLletres = edat.toString();

        assertEquals("**18", edatEnLletres);
    }

    @Test
    public void catchNullPointerTest() {
        Integer edat = null;
        String edatEnLletres;

        try {
            edatEnLletres = edat.toString();
        } catch (NullPointerException npe) {
            edat = 18;
            edatEnLletres = edat.toString();
        }

        assertEquals("**18", edatEnLletres);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwingIllegalArgumentExceptiontryCatchNullPointerTest() {
        Integer edat = null;
        String edatEnLletres = "";
        String text;

        try {
            System.out.println("Passa 1 - generam NullPointerException");
            edatEnLletres = edat.toString();
        } catch (NullPointerException npe) {
            System.out.println("Passa 2 - capturam la NULLPointerException");
            System.out.println("Passa 3 - Anam a llançar una excepció");
            throw new IllegalArgumentException("excepcio creada i llançada per mi");
        } finally {
            System.out.println("Passa final - codi de tancament");
        }
    }

    @Test(expected = NullPointerException.class)
    public void excepcioErronia() {
        Integer edat = null;
        String edatEnLletres = "";
        String text;

        try {
            System.out.println("Passa 1 - generam NullPointerException");
            edatEnLletres = edat.toString();

            throw new IllegalArgumentException("excepcio creada i llançada per mi");
        } catch (IllegalArgumentException e) {
            System.out.println("Passa 2 - capturam la IllegalArgumentException");
        } finally {
            System.out.println("Passa final - codi de tancament");
        }
    }

    @Test
    public void jugantAmbObjecteExcepcioTest() {
        Integer edat = null;
        String edatEnLletres;

        try {
            edatEnLletres = edat.toString();
        } catch (NullPointerException npe) {
            edat = 18;
            edatEnLletres = edat.toString();
            System.out.println("Anem a jugar amb l'objecte excepcio !!!!");

            System.out.println(npe.getMessage());
            System.out.println(npe.getStackTrace());
            npe.printStackTrace();
        }

        assertEquals("**18", edatEnLletres);
    }



}

