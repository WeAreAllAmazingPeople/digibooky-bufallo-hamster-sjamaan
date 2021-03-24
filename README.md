Maven (multimodule) structure

Digibooky (parent)
|- war => Web Archive (Jar) => *runnable*
|- spring boot
|- api
|- dto
|- mappers
|- service
|- domain
|- 'database' (repository)
|- domain objects (books, members, ...)
|- infrastructure
|- exceptions
|- utilities
