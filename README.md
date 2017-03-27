The Heroku dummy j1.8 project:

## Steps to deploy ##
Clone repo

Go to the folder

    cd EmployeeRest

Login heroku

    heroku login

Create a machine with Heroku-16 stack (needed for using java 8) and add remote heroku to your local repo

    heroku create --stack heroku-16

Push your repo to heroku server

    git push heroku master
    
  Run the heroku dyno described in the web Procfile

    heroku run web

  Or run in your local
    heroku local web

Open the app in your browser

    heroku open







