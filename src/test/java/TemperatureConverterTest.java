import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    import org.junit.Test;
import static org.junit.Assert.*;

    public class TemperatureConverterTest {

        private TemperatureConverter converter = new TemperatureConverter();

        @Test
        public void testFahrenheitToCelsius() {
            assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.001);
            assertEquals(0, converter.fahrenheitToCelsius(32), 0.001);
            assertEquals(100, converter.fahrenheitToCelsius(212), 0.001);
        }

        @Test
        public void testCelsiusToFahrenheit() {
            assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.001);
            assertEquals(32, converter.celsiusToFahrenheit(0), 0.001);
            assertEquals(212, converter.celsiusToFahrenheit(100), 0.001);
        }

        @Test
        public void testIsExtremeTemperature() {
            assertTrue(converter.isExtremeTemperature(-41));
            assertFalse(converter.isExtremeTemperature(-40));
            assertFalse(converter.isExtremeTemperature(50));
            assertTrue(converter.isExtremeTemperature(51));
        }
    }



}