# Use AWS Lambda Java base image
FROM public.ecr.aws/lambda/java:8

# Copy the built jar into the container
COPY target/AWS_SERVICES-1-SNAPSHOT-shaded.jar ${LAMBDA_TASK_ROOT}/app.jar

# Set the handler class
CMD ["com.services.FileUploadEventLambdaFunction::handleRequest"]
