package dmit2015.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    @ParameterizedTest(name = "length = {0}, width = {1}, expected result = {2}")
    @CsvSource({
            "10,20,200",
            "3,6,18",
            "10,10,100",
            "5,15,75"
    })

    void Area(double length, double width, double expectedArea) {
        //Arrange
        Rectangle currentRectangle = new Rectangle();
        //Act
        currentRectangle.setLength(length);
        currentRectangle.setWidth(width);
        //Assert
        assertEquals(expectedArea, currentRectangle.Area(), 0.05);
    }

    @ParameterizedTest(name = "length = {0}, width = {1}, perimeter = {2}")
    @CsvSource({
            "10,20,60",
            "3,6,18",
            "10,10,40",
            "5,15,40"
    })

    void Perimeter(double length, double width, double expectedPerimeter) {
        //Arrange
        Rectangle currentRectangle = new Rectangle();
        //Act
        currentRectangle.setWidth(width);
        currentRectangle.setLength(length);
        //Assert
        assertEquals(expectedPerimeter, currentRectangle.Perimeter(), 0.05);
    }

    @ParameterizedTest(name = "length = {0}, width = {1}, perimeter = {2}")
    @CsvSource({
            "10,20,22.36",
            "20,20,28.28"
    })

    void Diagonal(double length, double width, double expectedDiagonal) {
        //Arrange
        Rectangle currentRectangle = new Rectangle();
        //Act
        currentRectangle.setWidth(width);
        currentRectangle.setLength(length);
        //Assert
        assertEquals(expectedDiagonal, currentRectangle.Diagonal(), 0.05);
    }
}