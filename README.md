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
curl localhost:8080/calculateFunction -H "Content-Type: application/json" --data "{\"x\":10,\"y\":3}"
`

## References

https://github.com/spring-cloud/spring-cloud-function
