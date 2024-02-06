# Program by Logan Santamarina
# Date: 06.01
# Program for converting feet to inches
#ft to in
def feetToIn(value1):
    result = value1 * 12
    return result

def main():
    # Test values in ft
    test_value1 = 5
    test_value2 = 2.54
    test_value3 = -3.5

    print("Test 1:", feetToIn(test_value1))
    print("Test 2:", feetToIn(test_value2))
    print("Test 3:", feetToIn(test_value3))

main()