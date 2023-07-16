# Encryptor---Decryptor

This repository contains a simple Java program that demonstrates a keyword-based encryption and decryption process. The program allows users to encrypt or decrypt a word using a keyword as the encryption key.

How It Works

1. The program prompts the user to choose between encryption, decryption, or exiting the program.

2. For encryption, the user enters a word to encrypt.

3. The program validates the input to ensure it only contains lowercase letters. Any other characters will be considered invalid.

4. A key is generated based on a user-provided keyword. The key is calculated by summing the positions of the letters in the alphabet.

5. The encryption process is performed by shifting each letter of the word backward in the alphabet based on the key.
   
6. The encrypted word is displayed to the user.
   
7. For decryption, the user enters a word to decrypt.

8. Similar to encryption, the program validates the input to ensure it only contains lowercase letters.

9. The same key is generated based on the user-provided keyword.

10. The decryption process is performed by shifting each letter of the word forward in the alphabet based on the key.

11. The decrypted word is displayed to the user.

12. The program continues to prompt the user until they choose to exit.
