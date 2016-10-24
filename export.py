import json
import os
import re



file = []
fd = []
cwd = os.getcwd()
for (dirpath, dirnames, filenames) in os.walk(cwd):
    for files in filenames:
        if re.search('java', files):
            if files != "Main.java":
                file.append([os.path.join(dirpath, files), files])
for f in file:
    fr = open(f[0],encoding='utf-8').read()
    fd.append({
        "content":fr,
        "name":f[1]
    })
open('docs/exported.js', 'w', encoding='utf-8').write("answerKey = " + json.dumps(fd, indent=4, sort_keys=True))
