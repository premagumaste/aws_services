# Use AWS Lambda Java base image
FROM public.ecr.aws/lambda/java:8

# Copy the built jar into the container
COPY target/my-lambda-app.jar ${AWS_SERVICES-1-SNAPSHOT.jar}/app.jar

# Set the handler class
CMD ["FileUploadEventLambdaFunction::handleRequest"]
