import json
import os
import re


file = []
fd = {}
cwd = os.getcwd()
for (dirpath, dirnames, filenames) in os.walk(cwd):
    for files in filenames:
        if re.search('java', files):
            file.append([os.path.join(dirpath, files), files])
for f in file:
    fr = open(f[0],encoding='utf-8').read()
    fd[f[1]] = fr
open('exported.js', 'w', encoding='utf-8').write("answerKey = " + json.dumps(fd, indent=4, sort_keys=True))