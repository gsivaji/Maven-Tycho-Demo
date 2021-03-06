# Maven Tycho Demo

A Maven Tycho Demo project for Eclipse RCP applications such as Virtual Satellite.

## Project Status

Status [![Build Status](https://travis-ci.org/DLR-SC/Maven-Tycho-Demo.svg?branch=development)](https://travis-ci.org/DLR-SC/Maven-Tycho-Demo) [![Coverage Status](https://codecov.io/gh/DLR-SC/Maven-Tycho-Demo/branch/development/graph/badge.svg)](https://codecov.io/gh/DLR-SC/Maven-Tycho-Demo) [![Download Maven-Tycho-Demo](https://img.shields.io/sourceforge/dt/maven-tycho-demo.svg)](https://sourceforge.net/projects/maven-tycho-demo/files/development/) for *Development* build.

Status [![Build Status](https://travis-ci.org/DLR-SC/Maven-Tycho-Demo.svg?branch=integration)](https://travis-ci.org/DLR-SC/Maven-Tycho-Demo) [![Coverage Status](https://codecov.io/gh/DLR-SC/Maven-Tycho-Demo/branch/integration/graph/badge.svg)](https://codecov.io/gh/DLR-SC/Maven-Tycho-Demo) [![Download Maven-Tycho-Demo](https://img.shields.io/sourceforge/dt/maven-tycho-demo.svg)](https://sourceforge.net/projects/maven-tycho-demo/files/integration/) for *Integration* build.

Status [![Build Status](https://travis-ci.org/DLR-SC/Maven-Tycho-Demo.svg?branch=master)](https://travis-ci.org/DLR-SC/Maven-Tycho-Demo) [![Coverage Status](https://codecov.io/gh/DLR-SC/Maven-Tycho-Demo/branch/master/graph/badge.svg)](https://codecov.io/gh/DLR-SC/Maven-Tycho-Demo) [![Download Maven-Tycho-Demo](https://img.shields.io/sourceforge/dt/maven-tycho-demo.svg)](https://sourceforge.net/projects/maven-tycho-demo/files/release/) for *Master* build.

## Purpose

1. This project is a test setup to make Virtual Satellite open source. it helps to transform the software engineering processes from the internal towards the GitHub infrastructure. 
2. Maven Tycho can be very complicated. This project helps developers that are new to Maven Tycho. This project provides core functionality to automate an Eclipse RCP build process and helps setting up such process.

## Requirements 

This Maven Tycho Demo is based on Java / Eclipse. The following infrastructure is required:
 - Java Development Kit (JDK) 8
 - Eclipse Oxygen or newer
   - Including Checkstyle
   - Including Spotbugs
   - Including M2E
 - Maven 3
 - Windows 7 or Linux Computer

## Quickstart

1. Open your Eclipse and switch to the Git Perspective.
2. Clone this repository.
3. Import all projects and working-sets via the ProjectSet file in _de.dlr.maven.tycho.demo/projectSet_
4. Resolve and set the targe tplatform in _de.dlr.maven.tycho.demo.target/mavenTychoDemo.target
5. Execute the launchers for running the RCP application from within _de.dlr.maven.tycho.demo/launchers_
6. Execute the Tycho Maven build from _de.dlr.maven.tycho.demo/launchers_
7. Inspect the build artifacts for the p2 repository in _de.dlr.maven.tycho.p2updatesite/target_
7. Inspect the build RCP application in _de.dlr.maven.tycho.product/target_

## Travis CI and Releases

Tarvis CI is set-up to start a build job for every branch and every new commit to the repository. It executes all relevant tests such as jUnit, SWTBot, Checkstyle, SpotBugs, etc. Making a successful pull-request into development requires all tests to pass.

Starting a Travis CI job on development or integration deploys all relevant artifacts.

For creating a new release, create a tag starting with *Release_* on the *master* branch. All artifacts are automatically deployed.

## Provided Features

This example intends to represent a realistic scenario for building an Eclipse based RCP application such as Virtual Satellite. Accordingly it provides the following features:
 - Maven Tycho Build Process for Eclipse RCP Applications
 - Examples for Build with maven and eclipse
 - Examples for Development, Integration and Release builds
 - Examples for Features, Plugins, Products, Update Sites
 - Examples for License Feature
 - Examples for Branding Feature
 - Examples for Documents Feature with Release Notes and API Doc
 - Examples for External Library Dependencies
 - Examples for Test Fragments	
 - Integration of JUnit tests
 - Integration of Checkstyle tests
 - Integration of Spotbug checks
 - Standalone Maven Tycho build process
 - Eclipse IDE Integrated Maven Tycho build process

## Downloads and Deployment

Deployments are done using GitHub Releases as well as sourceforge: [![Download Maven-Tycho-Demo](https://sourceforge.net/sflogo.php?type=13&group_id=3065053)](https://sourceforge.net/projects/maven-tycho-demo/files/)

## Software Engineering Requirements

This project follows DLR Software Engineering Requirements for application class 1 as documented in the [Checklist](se_checklist_app_class_1.md).
 
## Contribution

To contribute to this project follow the given steps:

1. Create your own fork of the project.
2. Apply your changes.
3. Create a pull-request of your change to our development branch.

To increase chance that we accept your pull-request, make sure all tests are working. The best indicator is the Travis CI job. Next we will review your pull-request, give comments and maybe accept it.

## License

Copyright 2019 German Aerospace Center (DLR)

The German Aerospace Center (DLR) makes available all content in this plug-in ("Content").  Unless otherwise indicated below, the Content is provided to you under the terms and conditions of the Eclipse Public License Version 2.0 ("EPL").  A copy of the EPL is available at https://www.eclipse.org/legal/epl-2.0. For purposes of the EPL, "Program" will mean the Content.

If you did not receive this Content directly from German Aerospace Center (DLR), the Content is being redistributed by another party ("Redistributor") and different terms and conditions may apply to your use of any object code in the Content.  Check the Redistributor's license that was provided with the Content.  If no such license exists, contact the Redistributor.  Unless otherwise indicated below, the terms and conditions of the EPL still apply to this content.<p>

## Third Party Licenses

Third party licenses are named in the plug-ins where used in the respective _aboutfiles_ folders. At runtime third party licenses can be viewed in the usual Eclipse About dialog.
