Boilerplate Android Application
===============================

* Author:    Michael Spellecacy (<mspellecacy@frakle.com>)
* Date:      December, 2011
* Version:   0.0.1
* Website:   <http://www.frakle.com/>
* GitHub:    <https://github.com/mspellecacy/boilerplate>


Notes
=====
After initial clone you'll probably want to do this...


mv /path/to/boilerplate /path/to/yourapp
cd /path/to/yourapp
rm -rf .git/
mv src/com/frakle src/com/yourdomain
find . -type f | xargs perl -pi -e 's/Boilerplate/Yourapp/g'
find . -type f | xargs perl -pi -e 's/com\.frakle\.boilerplate/com\.yourdomain\.appname/g'
git init
git add .
git commit -m 'Initial Commit'


- Enjoy!