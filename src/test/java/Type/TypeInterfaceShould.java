package Type;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TypeInterfaceShould {

    @Test
    void work() {
        int before = 1;
        var after = 2;

        // Illegal :
        //
        // var nullObject = null
        // var i;
        // return type;
        // global variable
        // ...

        // Dangerous :
        //
        var obj = Application.doProcess();
        var badList = new ArrayList<>(); // Creates a list of objects
        // var goodList = new ArrayList<Type>(); (Type: String, Integer, ...)
        // Streams

        // Good :
        //
        var objectOfClass = new AClassWithALongName(); 



    }
}
