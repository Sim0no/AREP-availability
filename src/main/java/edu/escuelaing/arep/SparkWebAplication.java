package edu.escuelaing.arep;

import edu.escuelaing.arep.model.PrimeFinder;

import static spark.Spark.*;

public class SparkWebAplication {
    public static void main(String[] args) {
        port(getPort());
        get("/", (req, res)->"Programa para encontrar la cantidad de primos dado un numero");

        get("/:number", (req,res)->{
            return "Numero de primos encontrados hasta el "+req.params(":number")+" : "+ Integer.toString(PrimeFinder.search(req.params(":number")));
        });
    }
    /**
     * Gets port.
     *
     * @return the port
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}