#!/bin/bash

wget https://github.com/randoop/randoop/releases/download/v4.3.0/randoop-4.3.0.zip
unzip -q -o randoop-4.3.0.zip
mv "task ':distributionZip' property 'archiveBaseName'-task ':distributionZip' property 'archiveVersion'" randoop-4.3.0
rm -f randoop-4.3.0.zip
