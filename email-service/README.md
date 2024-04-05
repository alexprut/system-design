# Email Service

#### Functional Requirement

* Send emails
* Receive emails
* Bulk send emails (5000+ messages in less than 24h)
* Be able to send attachments (photos, videos, files, ...)

#### Non-functional Requirement

- Privacy
- Security
- High Consistency

### Stats

- 500MB storage per user inbox
- 10M+ users

### Diagram

![System Design](system-design.svg)

### Install

See example https://github.com/docker-mailserver/docker-mailserver

### Components:

#### MUA (Mail User Agent)

UI client that the final user interacts with. It is normally a program which is used to send and receive mail. It
accepts variety of commands for composing, receiving and replying to messages as well as for manipulation of the
mailboxes.

##### References

- https://en.wikipedia.org/wiki/Comparison_of_email_clients

#### MTA (Message Transfer Agent)

Transfers electronic mail messages from one computer to another using the Simple Mail Transfer Protocol.

##### References

- https://en.wikipedia.org/wiki/Message_transfer_agent
- https://en.wikipedia.org/wiki/Postfix_(software)

#### MSA (Message Submission Agent)

Software agent that receives electronic mail messages from a mail user agent (MUA) and cooperates with a mail transfer
agent (MTA) for delivery of the mail. Many MTAs perform the function of an MSA as well, but there are also programs that
are specially designed as MSAs without full MTA functionality

##### References

- https://en.wikipedia.org/wiki/Message_submission_agent

#### MDA (Message Delivery Agent)

Responsible for delivering the email to the local mailbox of a user.

##### References

- https://en.wikipedia.org/wiki/Message_delivery_agent
- https://en.wikipedia.org/wiki/Procmail

### TODO

- [ ] Add docker components to run locally
- [ ] Encryption: Add PGP / GPG in the architecture
- [ ] Add Postfix
- [ ] Add Authentication
- [ ] Add Spam detection
- [ ] Add procmail

### References

- https://www.statista.com/statistics/456500/daily-number-of-e-mails-worldwide/
- https://www.statista.com/statistics/255080/number-of-e-mail-users-worldwide/
- https://workspace.google.com/blog/identity-and-security/an-overview-of-gmails-spam-filters
- https://www.litmus.com/email-client-market-share
- https://en.wikipedia.org/wiki/Comparison_of_webmail_providers
- https://en.wikipedia.org/wiki/Pretty_Good_Privacy
- https://en.wikipedia.org/wiki/Email_client
- https://en.wikipedia.org/wiki/Post_Office_Protocol
- https://en.wikipedia.org/wiki/Internet_Message_Access_Protocol
- https://en.wikipedia.org/wiki/List_of_mail_server_software
- https://en.wikipedia.org/wiki/Procmail
- https://en.wikipedia.org/wiki/Apache_SpamAssassin
- https://en.wikipedia.org/wiki/MX_record