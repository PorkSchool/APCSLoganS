import random

class Cipher:
    def __init__(self):
        self.encryption = []

    def Decipher(self,msg):
        self.deciphered = ""

        for i in range(len(msg)):
            self.deciphered += chr(ord(msg[i])-self.encryption[i])
            
        print(self.deciphered)

        return self.deciphered
         
    def Encode(self,msg):
        self.encryption = [None] * len(msg)

        self.newMsg = ""
        for i in range(len(msg)):
            self.random_val = random.randint(0,10)
            self.encryption[i] = self.random_val
            self.newMsg += chr(ord(msg[i])+self.random_val)
            
            

        print(self.encryption)
        print(self.newMsg)
        return self.newMsg
        

def main():
    _cipher = Cipher()
    msg = _cipher.Encode("This is an encoded message")
    _cipher.Decipher(msg)

main()