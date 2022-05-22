package AppTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    @DisplayName("Whether the water is boiling")
    void testWater() {
        assertEquals("Water is boiling", Boilingwater.checkWaterTemp(240));
    }

    @Test
    @DisplayName("Making sure it's adding the two numbers")
    void canBeAdded(){
        assertEquals(30, Calculations.addition(20,10));  
    }

    @Test
    @DisplayName("Making sure it's subtracting the two numbers")
    void canBeSubtracted(){
        assertEquals(10, Calculations.subtraction(20, 10));  
    }

    @Test
    @DisplayName("Making sure it's multiplying the two numbers")
    void canBeMultiplied(){
        assertEquals(200, Calculations.multiplication(20, 10));  
    }

    @Test
    @DisplayName("Making sure it's dividing the two numbers")
    void canBeDivided(){
        assertEquals(2, Calculations.divison(20, 10));  
    }

    @Test
    @DisplayName("Making sure the modulus of two numbers")
    void Modulus(){
        assertEquals(0, Calculations.modulus(20, 10));  

    }
    }    
