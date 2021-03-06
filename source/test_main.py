from unittest import TestCase
from main import GameEngine

game = GameEngine()


class TestGameEngine(TestCase):

    def test_is_invalid_letter_is_numeric(self):

        self.assertTrue(game.is_invalid_letter("1"))

    def test_is_invalid_letter_is_special(self):

        self.assertTrue(game.is_invalid_letter("!"))

    def test_is_invalid_letters(self):

        self.assertTrue(game.is_invalid_letter("gh"))

    def test_is_valid_letter(self):

        self.assertFalse(game.is_invalid_letter("a"))

    def test_is_valid_letter_capital(self):

        self.assertFalse(game.is_invalid_letter("a"))

    def test_play_right_guess(self):

        game.secret_word = "apple"
        right_guess = 0

        for ch in "apple":
            letter_found = game.find_indexes(ch)
            if letter_found:
                right_guess += 1
        self.assertEqual(right_guess, len(game.secret_word))

    def test_play_wrong_guess(self):

        game.secret_word = "apple"
        right_guess = 0

        for ch in "orange":
            letter_found = game.find_indexes(ch)
            if letter_found:
                right_guess += 1
        self.assertNotEqual(right_guess, len(game.secret_word))



