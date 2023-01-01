********************* SMTP Client **************************

Project is written in IntelliJ IDEA JAVE IDE

Instruction to open Project

1. Download Intellij community edition if not downloaded.

2. Open the root folder named [SMTPClient]

3. If some error occur on some libraries module just move cursor to variable name and press [Alt + Enter] Button.

4. Now Just run the Programe.

Some Info related Code Working

Common SMTP Response Codes for Email Monitoring

Part of the inherent problem with SMTP codes is that different servers use the codes in different ways, 
making it impossible to state with certainty the meaning of each code. As you read through each response
 code below, keep in mind that the meaning could vary depending upon how your mail server was set up.

220 — SMTP Service ready.
This is a general reply stating that the SMTP server is ready to continue forward with the next command.

221 — Service closing.
This response states that the session or connection to the mail server is ending and all processes are complete. 
The end result could be either a success or failure.

250 — Requested action taken and completed.
This is the best message for a sender to receive because it indicates that the SMTP communication was successful. 
SMTP response code 250 is also the most common response code in SMTP since it is issued in response to every accepted
 command (likely 4 to 6 times per message).

354 — Start message input and end with …
This indicates that the server is ready to accept the message itself.

