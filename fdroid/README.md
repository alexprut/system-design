# F-Droid

An installable catalogue of FOSS applications for the Android platform. The
client makes it easy to browse, install, and keep track of updates on your device.

##### Functional Requirement
* Searching, downloading, verifying, and updating Android apps from an F-Droid repository
* Add new Android Apps (apk packages)
* Search applications to be installed on the Android phone
* Be notified when a new version of the application is released
* Install new application versions
* Reproducible Builds
* Service Website (including with documentation)

##### Non-functional Requirement
- Privacy
- Security
- Availability

### Stats
- 6000+ applications on the store (1000 with anti features)
- [150k+](https://fdroid.gitlab.io/metrics/search.f-droid.org/2021-01-18.json) hits per day

### Diagram
![System Design](system-design.svg)

### Install
```
git clone git@gitlab.com:fdroid/fdroid-website.git
```
```
git clone git@gitlab.com:fdroid/fdroid-website-search.git
```
```
git clone git@gitlab.com:fdroid/fdroidclient.git
```
```
git clone git@gitlab.com:fdroid/fdroiddata.git
```
```
git clone git@gitlab.com:fdroid/fdroidserver.git
```
```
git clone git@gitlab.com:fdroid/fdroid-monitor.git
```

### Components:

#### Website

Static website at https://f-droid.org that provides documentation and information. It is based on Jekyll.

###### References
- https://gitlab.com/fdroid/fdroid-website
- https://f-droid.org/en/docs/Deploying_the_Website/

#### Website Search
A simple stand-alone web application for searching through F-Droid repositories. Uses Django.

###### References
- https://gitlab.com/fdroid/fdroid-website-search

#### Android Client
Client for F-Droid. To be installed on the Android device.

###### References
- https://gitlab.com/fdroid/fdroidclient

#### Data
Associated metadata files for applications in the main F-Droid repository.

###### References
- https://gitlab.com/fdroid/fdroiddata

#### F-Droid Server (Build Server)
A suite of tools to publish and work with collections of Android apps (APK files) and other kinds of
packages.

###### References
- https://gitlab.com/fdroid/fdroidserver.git
- https://gitlab.com/fdroid/docker-executable-fdroidserver

#### Verification Server
It rebuilds apps from source that were built by f-droid.org and checks that the results match.
If they match, then there is a file named `*.verified.txt` added next to the APK that was verified.
If not, then there is output from [diffoscope](https://diffoscope.org/) in HTML and text.

###### References
- https://verification.f-droid.org/
- https://f-droid.org/docs/Verification_Server/

#### Monitor
A simple web-app for browsing f-droid build server info.

##### References
- https://gitlab.com/fdroid/fdroid-monitor

### API
Check https://f-droid.org/en/docs/All_our_APIs/.

### TODO
- [ ] Stats on required storage for all apk files?
- [ ] Stats on hardware requirements?
- [ ] How many DAU, or users there are per month?
- [ ] Stats on installations per month?
- [ ] How are F-Droid users notified that a new application version has been released?
- [ ] How are apps installed or upgraded?

### References
- https://f-droid.org/en/packages/
- https://gitlab.com/fdroid
- https://forum.f-droid.org/
- https://gitlab.com/fdroid
- https://f-droid.org/en/docs/All_our_APIs/
- https://f-droid.org/en/docs/Build_Metadata_Reference/
- https://f-droid.org/docs/Verification_Server/
- https://verification.f-droid.org/
- https://f-droid.org/en/docs/Code_of_Conduct/
- https://f-droid.org/en/docs/Get_F-Droid/