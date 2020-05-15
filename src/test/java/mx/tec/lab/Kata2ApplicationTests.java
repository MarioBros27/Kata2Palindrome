package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Kata2ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void given_ASingleCharacter_When_Verify_Then_True() {
		// Given
		String input = "a";
		boolean expectedResult = true;
		// When
		boolean result = PalindromeVerifier.verify(input);
		// Then
		assertEquals(expectedResult, result);
	}

	@Test
	void given_TwoDifferentCharacters_When_Verify_Then_False() {
		// Given
		String input = "ab";
		boolean expectedResult = false;
		// When
		boolean result = PalindromeVerifier.verify(input);
		// Then
		assertEquals(expectedResult, result);
	}

	@Test
	void given_TwoEqualCharacters_When_Verify_Then_True() {
		// Given
		String input = "aa";
		boolean expectedResult = true;
		// When
		boolean result = PalindromeVerifier.verify(input);
		// Then
		assertEquals(expectedResult, result);
	}

	@Test
	void given_ThreeLetterWordPalindrome_When_verify_Then_True() {
		// Given
		String input = "aba";
		boolean expectedResult = true;
		// When
		boolean result = PalindromeVerifier.verify(input);
		// Then
		assertEquals(expectedResult, result);
	}
	@Test
	void given_FourLetterWordPalindrome_When_verify_Then_True() {
		// Given
		String input = "abba";
		boolean expectedResult = true;
		// When
		boolean result = PalindromeVerifier.verify(input);
		// Then
		assertEquals(expectedResult, result);
	}
	@Test
	void given_APalindromePhrase_When_verify_Then_True() {
		// Given
		String input = "a man a plan a canal panama";
		boolean expectedResult = true;
		// When
		boolean result = PalindromeVerifier.verify(input);
		// Then
		assertEquals(expectedResult, result);
	}

}
