package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithAllFields() {
        // Given
        int expectedAge = 5;
        String expectedName = "Leon";
        String expectedAddress ="15 Express Ln";
        String expectedEyeColor = "brown";
        String expectedUsername = "lrk";
        String expectedHeight = "5.6";
        String expectedCell = "7663459876";

        // When
        Person person = new Person(expectedName, expectedAge, expectedAddress, expectedEyeColor, expectedUsername, expectedHeight, expectedCell);

        // Then
        int actualAge = person.getAge();
        String actualName = person.getName();
        String actualAddress = person.getAddress();
        String actualEyeColor = person.getEyeColor();
        String actualUsername = person.getUsername();
        String actualHeight = person.getHeight();
        String actualCell = person.getCell();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedUsername, actualUsername);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedCell, actualCell);
    }


    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAddress() {
        // Given
        Person person = new Person();
        String expected = "15 Express Ln";

        // When
        person.setAddress(expected);

        // Then
        String actual = person.getAddress();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "blue";

        // When
        person.setEyeColor(expected);

        // Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        String expected = "5";

        // When
        person.setHeight(expected);

        // Then
        String actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetUsername() {
        // Given
        Person person = new Person();
        String expected = "lrk";

        // When
        person.setUsername(expected);

        // Then
        String actual = person.getUsername();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testSetCell() {
        // Given
        Person person = new Person();
        String expected = "3025469876";

        // When
        person.setCell(expected);

        // Then
        String actual = person.getCell();
        Assert.assertEquals(expected, actual);
    }

}
