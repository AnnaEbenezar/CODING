import hexa as hex
import unittest

class KnownValues(unittest.TestCase):
    KnownValues = (
        (14, "E"),
        (16, "10"),
        (171,"AB"),
        (3452, "D7C"),
        (352, "160"),
        (15, "F"),
        (0, "0"),
        (1, "1"),
        (1234, "4D2"),
        (2781, "ADD"),
        (44252, "ACDC"),
        (65535, "FFFF"),
        (65536, "10000"),
        (1000, "3E8"),
        (789, "315"),
        (6940, "1B1C"),
        (255, "FF"),
        (3654, "E46"),
        (12, "C"))

    def testToHexaValues(self):
        for integer, hexValue in self.KnownValues:
            result = hex.toHex(integer)
            self.assertEqual(hexValue, result)

class ToHexaBadInput(unittest.TestCase):
    def testNegativeInteger(self):
        self.assertRaises(hex.InvalidArgument,hex.toHex, -1)

class CaseCheck(unittest.TestCase):
    def testtoHexaCase(self):
        for integer in range(0, 70000):
            value = hex.toHex(integer)
            self.assertEqual(value,value.upper())

if __name__ == "__main__":
    unittest.main()