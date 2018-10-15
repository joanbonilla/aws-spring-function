# Spring Cloud Function

## Adapter

This project uses `spring-cloud-function` with `spring-cloud-function-adapter-aws`

## Run

Execute function with the next JSON message

```json
{
  "x": 10,
  "y": 3
}
```

`
curl -H "Content-Type: text/plain" localhost:8080/calculateFunction -d Hello
`

## References

https://github.com/spring-cloud/spring-cloud-function
